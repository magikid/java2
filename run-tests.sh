cd "HW1"
ant -f "HW1" -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test
ant -f "HW1" -Dnb.internal.action.name=rebuild clean jar
cd ..

cd "p1"
ant -f "p1" -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test
ant -f "p1" -Dnb.internal.action.name=rebuild clean jar
cd ..

cd "HW2"
ant -f "HW2" -Dnb.internal.action.name=rebuild clean jar
cd ..
