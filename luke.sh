java -XX:MaxPermSize=512m -jar target/luke-with-deps.jar
#
# In order to start luke with your custom analyzer class extending org.apache.lucene.analysis.Analyzer run:
# java -XX:MaxPermSize=512m -cp target/luke-with-deps.jar:/path/to/custom_analyzer.jar org.getopt.luke.Luke
# your analyzer should appear in the drop-down menu with analyzers on the Search tab
#java -XX:MaxPermSize=512m -cp target/luke-with-deps.jar:/home/dmitry/projects/github/suggestinganalyzer/target/suggestinganalyzer-1.0-SNAPSHOT.jar org.getopt.luke.Luke
