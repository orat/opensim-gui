/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentAlreadyPartOfOwnershipTree extends OpenSimException {
  private transient long swigCPtr;

  public ComponentAlreadyPartOfOwnershipTree(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ComponentAlreadyPartOfOwnershipTree_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentAlreadyPartOfOwnershipTree obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentAlreadyPartOfOwnershipTree(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ComponentAlreadyPartOfOwnershipTree(String file, long line, String func, String compName, String thisName) {
    this(opensimCommonJNI.new_ComponentAlreadyPartOfOwnershipTree(file, line, func, compName, thisName), true);
  }

}
