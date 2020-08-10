#rm -rf build && mkdir build
javac src/com/heinthanth/pseuci/*.java -d build/
cd build && jar cfe pseuci.jar com.heinthanth.pseuci.Pseuci com/heinthanth/pseuci/*.class
mv pseuci.jar ../ && cd ..