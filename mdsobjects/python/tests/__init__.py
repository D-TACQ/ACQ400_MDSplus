"""
MDSplus tests
==========

Tests of MDSplus

"""
def _mimportSuite(name, level=1):
    try:
        return __import__(name, globals(), level=level).suite
    except:
        return __import__(name, globals()).suite

from unittest import TestCase,TestSuite,TextTestRunner
import os,sys
import gc;gc.set_debug(gc.DEBUG_UNCOLLECTABLE)

from MDSplus import setenv,getenv
if os.name=='nt':
    setenv("PyLib","python%d%d"  % sys.version_info[0:2])
else:
    setenv("PyLib","python%d.%d" % sys.version_info[0:2])

connectionsSuite=_mimportSuite('connectionUnitTest')
dataSuite=       _mimportSuite('dataUnitTest')
dclSuite=        _mimportSuite('dclUnitTest')
devicesSuite=    _mimportSuite('devicesUnitTest')
exceptionSuite=  _mimportSuite('exceptionUnitTest')
segmentsSuite=   _mimportSuite('segmentsUnitTest')
treeSuite=       _mimportSuite('treeUnitTest')
threadsSuite=    _mimportSuite('threadsUnitTest')

class cleanup(TestCase):
    dir=None

    def cleanup(self):
        if cleanup.dir is not None:
            dir=cleanup.dir
            for i in os.walk(dir,False):
                for f in i[2]:
                    try:
                      os.remove(i[0]+os.sep+f)
                    except Exception:
                      import sys
                      e=sys.exc_info()[1]
                      print( e)
                for d in i[1]:
                    try:
                      os.rmdir(i[0]+os.sep+d)
                    except Exception:
                      import sys
                      e=sys.exc_info()[1]
                      print( e)
            try:
              os.rmdir(dir)
            except Exception:
              import sys
              e=sys.exc_info()[1]
              print( e)
        return
    def runTest(self):
        self.cleanup()

def test_all(*arg):
    if getenv('waitdbg') is not None:
      print("Hit return after gdb is connected\n")
      sys.stdin.readline()
    tests=list()
    tests.append(dataSuite())
    tests.append(dclSuite())
    tests.append(devicesSuite())
    tests.append(connectionsSuite())
    tests.append(exceptionSuite())
    tests.append(segmentsSuite())
    tests.append(treeSuite())
    if os.getenv('TEST_THREADS') is not None:
        tests.append(threadsSuite())
    return TestSuite(tests)

def run():
    TextTestRunner().run(test_all())

if __name__=='__main__':
    run()
