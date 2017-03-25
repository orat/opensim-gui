/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ComponentFilterMatchAll extends ComponentFilter {
  private transient long swigCPtr;

  public ComponentFilterMatchAll(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.ComponentFilterMatchAll_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ComponentFilterMatchAll obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ComponentFilterMatchAll(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ComponentFilterMatchAll() {
    this(opensimCommonJNI.new_ComponentFilterMatchAll(), true);
  }

  public boolean isMatch(Component comp) {
    return opensimCommonJNI.ComponentFilterMatchAll_isMatch(swigCPtr, this, Component.getCPtr(comp), comp);
  }

  public ComponentFilter clone() {
    long cPtr = opensimCommonJNI.ComponentFilterMatchAll_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ComponentFilterMatchAll(cPtr, true);
  }

}
