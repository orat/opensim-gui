/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class FileExtensionNotFound extends InvalidArgument {
  private transient long swigCPtr;

  public FileExtensionNotFound(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.FileExtensionNotFound_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(FileExtensionNotFound obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_FileExtensionNotFound(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FileExtensionNotFound(String file, long line, String func, String filename) {
    this(opensimCommonJNI.new_FileExtensionNotFound(file, line, func, filename), true);
  }

}
