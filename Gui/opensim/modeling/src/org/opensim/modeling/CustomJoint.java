/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CustomJoint extends Joint {
  private long swigCPtr;

  public CustomJoint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CustomJoint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CustomJoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CustomJoint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CustomJoint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CustomJoint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CustomJoint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CustomJoint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CustomJoint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CustomJoint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CustomJoint(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CustomJoint_getConcreteClassName(swigCPtr, this);
  }

  public CustomJoint() {
    this(opensimModelJNI.new_CustomJoint__SWIG_0(), true);
  }

  public CustomJoint(String name, Body parent, SWIGTYPE_p_SimTK__Vec3 locationInParent, SWIGTYPE_p_SimTK__Vec3 orientationInParent, Body body, SWIGTYPE_p_SimTK__Vec3 locationInBody, SWIGTYPE_p_SimTK__Vec3 orientationInBody, SpatialTransform aSpatialTransform, boolean reverse) {
    this(opensimModelJNI.new_CustomJoint__SWIG_1(name, Body.getCPtr(parent), parent, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInParent), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInParent), Body.getCPtr(body), body, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInBody), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInBody), SpatialTransform.getCPtr(aSpatialTransform), aSpatialTransform, reverse), true);
  }

  public CustomJoint(String name, Body parent, SWIGTYPE_p_SimTK__Vec3 locationInParent, SWIGTYPE_p_SimTK__Vec3 orientationInParent, Body body, SWIGTYPE_p_SimTK__Vec3 locationInBody, SWIGTYPE_p_SimTK__Vec3 orientationInBody, SpatialTransform aSpatialTransform) {
    this(opensimModelJNI.new_CustomJoint__SWIG_2(name, Body.getCPtr(parent), parent, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInParent), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInParent), Body.getCPtr(body), body, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInBody), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInBody), SpatialTransform.getCPtr(aSpatialTransform), aSpatialTransform), true);
  }

  public CustomJoint(String name, Body parent, SWIGTYPE_p_SimTK__Vec3 locationInParent, SWIGTYPE_p_SimTK__Vec3 orientationInParent, Body body, SWIGTYPE_p_SimTK__Vec3 locationInBody, SWIGTYPE_p_SimTK__Vec3 orientationInBody, boolean reverse) {
    this(opensimModelJNI.new_CustomJoint__SWIG_3(name, Body.getCPtr(parent), parent, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInParent), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInParent), Body.getCPtr(body), body, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInBody), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInBody), reverse), true);
  }

  public CustomJoint(String name, Body parent, SWIGTYPE_p_SimTK__Vec3 locationInParent, SWIGTYPE_p_SimTK__Vec3 orientationInParent, Body body, SWIGTYPE_p_SimTK__Vec3 locationInBody, SWIGTYPE_p_SimTK__Vec3 orientationInBody) {
    this(opensimModelJNI.new_CustomJoint__SWIG_4(name, Body.getCPtr(parent), parent, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInParent), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInParent), Body.getCPtr(body), body, SWIGTYPE_p_SimTK__Vec3.getCPtr(locationInBody), SWIGTYPE_p_SimTK__Vec3.getCPtr(orientationInBody)), true);
  }

  public CustomJoint(CustomJoint aJoint) {
    this(opensimModelJNI.new_CustomJoint__SWIG_5(CustomJoint.getCPtr(aJoint), aJoint), true);
  }

  public void copyData(CustomJoint aJoint) {
    opensimModelJNI.CustomJoint_copyData(swigCPtr, this, CustomJoint.getCPtr(aJoint), aJoint);
  }

  public int numCoordinates() {
    return opensimModelJNI.CustomJoint_numCoordinates(swigCPtr, this);
  }

  public SpatialTransform getSpatialTransform() {
    return new SpatialTransform(opensimModelJNI.CustomJoint_getSpatialTransform(swigCPtr, this), false);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelJNI.CustomJoint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode, int versionNumber) {
    opensimModelJNI.CustomJoint_updateFromXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode), versionNumber);
  }

  public void updateFromXMLNode(SWIGTYPE_p_SimTK__Xml__Element aNode) {
    opensimModelJNI.CustomJoint_updateFromXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(aNode));
  }

}
