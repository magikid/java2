cd HW1
echo "Running HW1 tests"
ant -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test
echo "Building HW1"
ant -Dnb.internal.action.name=rebuild clean jar
cd ..

cd p1
echo "Running p1 tests"
ant -f p1 -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test
echo "Building p1"
ant -f p1 -Dnb.internal.action.name=rebuild clean jar
cd ..

cd HW2
echo "Building HW2"
ant -f HW2 -Dnb.internal.action.name=rebuild clean jar
cd ..
