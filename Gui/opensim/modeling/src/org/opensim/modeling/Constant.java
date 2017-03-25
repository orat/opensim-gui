/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Constant extends Function {
  private transient long swigCPtr;

  public Constant(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.Constant_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Constant obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_Constant(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Constant safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.Constant_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Constant(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.Constant_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.Constant_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.Constant_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Constant(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.Constant_getConcreteClassName(swigCPtr, this);
  }

  public Constant() {
    this(opensimCommonJNI.new_Constant__SWIG_0(), true);
  }

  public Constant(double value) {
    this(opensimCommonJNI.new_Constant__SWIG_1(value), true);
  }

  public Constant(Constant aSpline) {
    this(opensimCommonJNI.new_Constant__SWIG_2(Constant.getCPtr(aSpline), aSpline), true);
  }

  public void setValue(double aValue) {
    opensimCommonJNI.Constant_setValue(swigCPtr, this, aValue);
  }

  public double calcValue(Vector xUnused) {
    return opensimCommonJNI.Constant_calcValue(swigCPtr, this, Vector.getCPtr(xUnused), xUnused);
  }

  public double getValue() {
    return opensimCommonJNI.Constant_getValue(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimCommonJNI.Constant_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}
