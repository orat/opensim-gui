/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointConstraint extends Constraint {
  private transient long swigCPtr;

  public PointConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PointConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PointConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PointConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PointConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PointConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PointConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PointConstraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_location_body_1(PointConstraint source) {
    opensimSimulationJNI.PointConstraint_copyProperty_location_body_1(swigCPtr, this, PointConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_1(int i) {
    return new Vec3(opensimSimulationJNI.PointConstraint_get_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_1(int i) {
    return new Vec3(opensimSimulationJNI.PointConstraint_upd_location_body_1__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_1(int i, Vec3 value) {
    opensimSimulationJNI.PointConstraint_set_location_body_1__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_1(Vec3 value) {
    return opensimSimulationJNI.PointConstraint_append_location_body_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_1(Vec3 initValue) {
    opensimSimulationJNI.PointConstraint_constructProperty_location_body_1(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_1() {
    return new Vec3(opensimSimulationJNI.PointConstraint_get_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_1() {
    return new Vec3(opensimSimulationJNI.PointConstraint_upd_location_body_1__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_1(Vec3 value) {
    opensimSimulationJNI.PointConstraint_set_location_body_1__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_location_body_2(PointConstraint source) {
    opensimSimulationJNI.PointConstraint_copyProperty_location_body_2(swigCPtr, this, PointConstraint.getCPtr(source), source);
  }

  public Vec3 get_location_body_2(int i) {
    return new Vec3(opensimSimulationJNI.PointConstraint_get_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_location_body_2(int i) {
    return new Vec3(opensimSimulationJNI.PointConstraint_upd_location_body_2__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_location_body_2(int i, Vec3 value) {
    opensimSimulationJNI.PointConstraint_set_location_body_2__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_location_body_2(Vec3 value) {
    return opensimSimulationJNI.PointConstraint_append_location_body_2(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_location_body_2(Vec3 initValue) {
    opensimSimulationJNI.PointConstraint_constructProperty_location_body_2(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_location_body_2() {
    return new Vec3(opensimSimulationJNI.PointConstraint_get_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_location_body_2() {
    return new Vec3(opensimSimulationJNI.PointConstraint_upd_location_body_2__SWIG_1(swigCPtr, this), false);
  }

  public void set_location_body_2(Vec3 value) {
    opensimSimulationJNI.PointConstraint_set_location_body_2__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_body_1_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointConstraint_PropertyIndex_socket_body_1_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_body_1_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointConstraint_PropertyIndex_socket_body_1_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_body_1(OpenSimObject object) {
    opensimSimulationJNI.PointConstraint_connectSocket_body_1(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_body_2_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PointConstraint_PropertyIndex_socket_body_2_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_body_2_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PointConstraint_PropertyIndex_socket_body_2_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_body_2(OpenSimObject object) {
    opensimSimulationJNI.PointConstraint_connectSocket_body_2(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public PointConstraint() {
    this(opensimSimulationJNI.new_PointConstraint__SWIG_0(), true);
  }

  public PointConstraint(PhysicalFrame body1, Vec3 locationBody1, PhysicalFrame body2, Vec3 locationBody2) {
    this(opensimSimulationJNI.new_PointConstraint__SWIG_1(PhysicalFrame.getCPtr(body1), body1, Vec3.getCPtr(locationBody1), locationBody1, PhysicalFrame.getCPtr(body2), body2, Vec3.getCPtr(locationBody2), locationBody2), true);
  }

  public void setBody1ByName(String aBodyName) {
    opensimSimulationJNI.PointConstraint_setBody1ByName(swigCPtr, this, aBodyName);
  }

  public void setBody1PointLocation(Vec3 location) {
    opensimSimulationJNI.PointConstraint_setBody1PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setBody2ByName(String aBodyName) {
    opensimSimulationJNI.PointConstraint_setBody2ByName(swigCPtr, this, aBodyName);
  }

  public void setBody2PointLocation(Vec3 location) {
    opensimSimulationJNI.PointConstraint_setBody2PointLocation(swigCPtr, this, Vec3.getCPtr(location), location);
  }

  public void setContactPointForInducedAccelerations(State s, Vec3 point) {
    opensimSimulationJNI.PointConstraint_setContactPointForInducedAccelerations(swigCPtr, this, State.getCPtr(s), s, Vec3.getCPtr(point), point);
  }

}
