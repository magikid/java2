errors=0;
cd HW1;
echo "Running HW1 tests";
ant -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test;
if [ "$?" -ne 0 ]; then errors=1; fi;
echo "Building HW1";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=2; fi;
cd ..;

cd p1;
echo "Running p1 tests";
ant -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test;
if [ "$?" -ne 0 ]; then errors=3; fi;
echo "Building p1";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=4; fi;
cd ..;

cd HW2;
echo "Building HW2";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=5; fi
cd ..;

cd HW3;
echo "Running HW3 tests";
ant -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test;
if [ "$?" -ne 0 ]; then errors=6; fi;
echo "Building HW3";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=7; fi
cd ..;

cd P2;
echo "Running P2 tests";
ant -Dnb.internal.action.name=test -Dignore.failing.tests=true -Dnb.wait.for.caches=true test;
if [ "$?" -ne 0 ]; then errors=8; fi;
echo "Building P2";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=9; fi
cd ..;

cd P3;
echo "Building P3";
ant -Dnb.internal.action.name=rebuild clean jar;
if [ "$?" -ne 0 ]; then errors=10; fi
cd ..;

exit $errors;

