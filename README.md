# Oblig3-SE-22

Followed the teachers guid on how to get maven-surefire to work. Had to add a groupId on top to remove the error that occurred.

After allowing GitHub to help me make the workflow-folder and maven.yml-file followed a lot of googling while trying to understand why it did not show the test when I ran the job in Actions. I did need the TA to tell me that I needed to put Test* in front of all my tests and .class-file to get it working, even though i visited https://stackoverflow.com/questions/6178583/maven-does-not-find-junit-tests-to-run/6178629#6178629 multiple times. After that, Actions worked like a clock. Even though it now runs the tests in both 'Run test' and 'Build with Maven' 
