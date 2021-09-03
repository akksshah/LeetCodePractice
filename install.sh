Help()
{
   echo
   echo
   echo
   echo
   echo
   echo
   echo "Syntax: scriptTemplate [-j|l|w|t|p]"
   echo "options:"
   echo "j     jmx file that has the test plan"
   echo "l     jtl log file"
   echo "w     web folder to save to"
   echo "t     Specify number of Peak threads to run the test with for all api."
   echo "p     Specify the testType > basic/advanced"
   echo
   echo
   echo "NOTE:      Order of run is go java node python"
   echo
}

jmxFile=""
jtlFile=""
webFolder=""
peakThreads=""
testType=""
jmeter="/home/i_gorton/apache-jmeter-5.4.1/bin/jmeter"

while getopts ":h:j:l:w:t:p:" opt; do
   case $opt in
      h) # display Help
         Help
         exit;;
      j)
        jmxFile=$OPTARG
        echo "jmx $jmxFile"
        ;;
      l)
        jtlFile=$OPTARG
        echo "jtl $jtlFile"
        ;;
      w)
        webFolder=$OPTARG
        echo "web $webFolder"
        ;;
      p)
        testType=$OPTARG
        echo "type: $testType"
        ;;
      t)
        peakThreads=$OPTARG
        ;;
     \?) # Invalid option
         echo "Error: Invalid option"
#         exit
         ;;
   esac
done
if [ -n "$testType" ]
then
  if [ -n "$peakThreads" ]
  then
    allApi=("go" "java" "node" "python")
    for api in "${allApi[@]}"; do
      RUN $jmeter -n -t "$testType"_Peak_"$peakThreads"_"$api".jmx -l "$testType"_Peak"$peakThreads"_"$api".jtl -e -o web_"$testType"_Peak"$peakThreads"_"$api"
    done
  elif [ -n "$jmxFile" ] && [ -n "$jtlFile" ] && [ -n "$webFolder" ]
  then
    RUN $jmeter -n -t "$jmxFile" -l "$jtlFile" -e -o "$webFolder"
  else
    echo "Invalid Arguments"
    Help
  fi
else
  echo "Invalid Arguments"
  Help
fi