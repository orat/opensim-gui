/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class IncorrectNumMetaDataKeys extends IOError {
  private transient long swigCPtr;

  public IncorrectNumMetaDataKeys(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.IncorrectNumMetaDataKeys_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(IncorrectNumMetaDataKeys obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_IncorrectNumMetaDataKeys(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public IncorrectNumMetaDataKeys(String file, long line, String func, String filename, long expected, long received) {
    this(opensimCommonJNI.new_IncorrectNumMetaDataKeys(file, line, func, filename, expected, received), true);
  }

}
