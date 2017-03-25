/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SimmSpline extends Function {
  private transient long swigCPtr;

  public SimmSpline(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.SimmSpline_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SimmSpline obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_SimmSpline(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SimmSpline safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.SimmSpline_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SimmSpline(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.SimmSpline_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.SimmSpline_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.SimmSpline_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SimmSpline(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.SimmSpline_getConcreteClassName(swigCPtr, this);
  }

  public SimmSpline() {
    this(opensimCommonJNI.new_SimmSpline__SWIG_0(), true);
  }

  public SimmSpline(int aN, SWIGTYPE_p_double aTimes, SWIGTYPE_p_double aValues, String aName) {
    this(opensimCommonJNI.new_SimmSpline__SWIG_1(aN, SWIGTYPE_p_double.getCPtr(aTimes), SWIGTYPE_p_double.getCPtr(aValues), aName), true);
  }

  public SimmSpline(int aN, SWIGTYPE_p_double aTimes, SWIGTYPE_p_double aValues) {
    this(opensimCommonJNI.new_SimmSpline__SWIG_2(aN, SWIGTYPE_p_double.getCPtr(aTimes), SWIGTYPE_p_double.getCPtr(aValues)), true);
  }

  public SimmSpline(SimmSpline aSpline) {
    this(opensimCommonJNI.new_SimmSpline__SWIG_3(SimmSpline.getCPtr(aSpline), aSpline), true);
  }

  public void init(Function aFunction) {
    opensimCommonJNI.SimmSpline_init(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public int getSize() {
    return opensimCommonJNI.SimmSpline_getSize(swigCPtr, this);
  }

  public ArrayDouble getX() {
    return new ArrayDouble(opensimCommonJNI.SimmSpline_getX__SWIG_0(swigCPtr, this), false);
  }

  public ArrayDouble getY() {
    return new ArrayDouble(opensimCommonJNI.SimmSpline_getY__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_double getXValues() {
    long cPtr = opensimCommonJNI.SimmSpline_getXValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public SWIGTYPE_p_double getYValues() {
    long cPtr = opensimCommonJNI.SimmSpline_getYValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public int getNumberOfPoints() {
    return opensimCommonJNI.SimmSpline_getNumberOfPoints(swigCPtr, this);
  }

  public double getX(int aIndex) {
    return opensimCommonJNI.SimmSpline_getX__SWIG_1(swigCPtr, this, aIndex);
  }

  public double getY(int aIndex) {
    return opensimCommonJNI.SimmSpline_getY__SWIG_1(swigCPtr, this, aIndex);
  }

  public double getZ(int aIndex) {
    return opensimCommonJNI.SimmSpline_getZ(swigCPtr, this, aIndex);
  }

  public void setX(int aIndex, double aValue) {
    opensimCommonJNI.SimmSpline_setX(swigCPtr, this, aIndex, aValue);
  }

  public void setY(int aIndex, double aValue) {
    opensimCommonJNI.SimmSpline_setY(swigCPtr, this, aIndex, aValue);
  }

  public boolean deletePoint(int aIndex) {
    return opensimCommonJNI.SimmSpline_deletePoint(swigCPtr, this, aIndex);
  }

  public boolean deletePoints(ArrayInt indices) {
    return opensimCommonJNI.SimmSpline_deletePoints(swigCPtr, this, ArrayInt.getCPtr(indices), indices);
  }

  public int addPoint(double aX, double aY) {
    return opensimCommonJNI.SimmSpline_addPoint(swigCPtr, this, aX, aY);
  }

  public double calcValue(Vector x) {
    return opensimCommonJNI.SimmSpline_calcValue(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcDerivative(StdVectorInt derivComponents, Vector x) {
    return opensimCommonJNI.SimmSpline_calcDerivative(swigCPtr, this, StdVectorInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public int getArgumentSize() {
    return opensimCommonJNI.SimmSpline_getArgumentSize(swigCPtr, this);
  }

  public int getMaxDerivativeOrder() {
    return opensimCommonJNI.SimmSpline_getMaxDerivativeOrder(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimCommonJNI.SimmSpline_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimCommonJNI.SimmSpline_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimCommonJNI.SimmSpline_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

}
