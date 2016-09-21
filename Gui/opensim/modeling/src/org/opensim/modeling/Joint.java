/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Joint extends ModelComponent {
  private transient long swigCPtr;

  public Joint(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Joint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Joint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Joint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Joint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Joint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Joint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Joint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Joint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Joint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Joint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Joint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinates(Joint source) {
    opensimModelSimulationJNI.Joint_copyProperty_coordinates(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public Coordinate get_coordinates(int i) {
    return new Coordinate(opensimModelSimulationJNI.Joint_get_coordinates(swigCPtr, this, i), false);
  }

  public Coordinate upd_coordinates(int i) {
    return new Coordinate(opensimModelSimulationJNI.Joint_upd_coordinates(swigCPtr, this, i), false);
  }

  public void set_coordinates(int i, Coordinate value) {
    opensimModelSimulationJNI.Joint_set_coordinates(swigCPtr, this, i, Coordinate.getCPtr(value), value);
  }

  public int append_coordinates(Coordinate value) {
    return opensimModelSimulationJNI.Joint_append_coordinates(swigCPtr, this, Coordinate.getCPtr(value), value);
  }

  public void constructProperty_coordinates() {
    opensimModelSimulationJNI.Joint_constructProperty_coordinates(swigCPtr, this);
  }

  public void copyProperty_reverse(Joint source) {
    opensimModelSimulationJNI.Joint_copyProperty_reverse(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public boolean get_reverse(int i) {
    return opensimModelSimulationJNI.Joint_get_reverse__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_reverse(int i) {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Joint_upd_reverse__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_reverse(int i, boolean value) {
    opensimModelSimulationJNI.Joint_set_reverse__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_reverse(boolean value) {
    return opensimModelSimulationJNI.Joint_append_reverse(swigCPtr, this, value);
  }

  public void constructProperty_reverse(boolean initValue) {
    opensimModelSimulationJNI.Joint_constructProperty_reverse(swigCPtr, this, initValue);
  }

  public boolean get_reverse() {
    return opensimModelSimulationJNI.Joint_get_reverse__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_reverse() {
    return new SWIGTYPE_p_bool(opensimModelSimulationJNI.Joint_upd_reverse__SWIG_1(swigCPtr, this), false);
  }

  public void set_reverse(boolean value) {
    opensimModelSimulationJNI.Joint_set_reverse__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_frames(Joint source) {
    opensimModelSimulationJNI.Joint_copyProperty_frames(swigCPtr, this, Joint.getCPtr(source), source);
  }

  public PhysicalFrame get_frames(int i) {
    return new PhysicalFrame(opensimModelSimulationJNI.Joint_get_frames(swigCPtr, this, i), false);
  }

  public PhysicalFrame upd_frames(int i) {
    return new PhysicalFrame(opensimModelSimulationJNI.Joint_upd_frames(swigCPtr, this, i), false);
  }

  public void set_frames(int i, PhysicalFrame value) {
    opensimModelSimulationJNI.Joint_set_frames(swigCPtr, this, i, PhysicalFrame.getCPtr(value), value);
  }

  public int append_frames(PhysicalFrame value) {
    return opensimModelSimulationJNI.Joint_append_frames(swigCPtr, this, PhysicalFrame.getCPtr(value), value);
  }

  public void constructProperty_frames() {
    opensimModelSimulationJNI.Joint_constructProperty_frames(swigCPtr, this);
  }

  public void set_connector_parent_frame(int value) {
    opensimModelSimulationJNI.Joint__connector_parent_frame_set(swigCPtr, this, value);
  }

  public int get_connector_parent_frame() {
    return opensimModelSimulationJNI.Joint__connector_parent_frame_get(swigCPtr, this);
  }

  public void set_connector_child_frame(int value) {
    opensimModelSimulationJNI.Joint__connector_child_frame_set(swigCPtr, this, value);
  }

  public int get_connector_child_frame() {
    return opensimModelSimulationJNI.Joint__connector_child_frame_get(swigCPtr, this);
  }

  public void set_has_output_power(boolean value) {
    opensimModelSimulationJNI.Joint__has_output_power_set(swigCPtr, this, value);
  }

  public boolean get_has_output_power() {
    return opensimModelSimulationJNI.Joint__has_output_power_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_parent(boolean value) {
    opensimModelSimulationJNI.Joint__has_output_reaction_on_parent_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_parent() {
    return opensimModelSimulationJNI.Joint__has_output_reaction_on_parent_get(swigCPtr, this);
  }

  public void set_has_output_reaction_on_child(boolean value) {
    opensimModelSimulationJNI.Joint__has_output_reaction_on_child_set(swigCPtr, this, value);
  }

  public boolean get_has_output_reaction_on_child() {
    return opensimModelSimulationJNI.Joint__has_output_reaction_on_child_get(swigCPtr, this);
  }

  public PhysicalFrame getChildFrame() {
    return new PhysicalFrame(opensimModelSimulationJNI.Joint_getChildFrame(swigCPtr, this), false);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimModelSimulationJNI.Joint_getParentFrame(swigCPtr, this), false);
  }

  public Coordinate getCoordinate() {
    return new Coordinate(opensimModelSimulationJNI.Joint_getCoordinate(swigCPtr, this), false);
  }

  public Coordinate updCoordinate() {
    return new Coordinate(opensimModelSimulationJNI.Joint_updCoordinate(swigCPtr, this), false);
  }

  public boolean getReverse() {
    return opensimModelSimulationJNI.Joint_getReverse(swigCPtr, this);
  }

  public int numCoordinates() {
    return opensimModelSimulationJNI.Joint_numCoordinates(swigCPtr, this);
  }

  public boolean isCoordinateUsed(Coordinate aCoordinate) {
    return opensimModelSimulationJNI.Joint_isCoordinateUsed(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public SpatialVec calcEquivalentSpatialForce(State state, Vector mobilityForces) {
    return new SpatialVec(opensimModelSimulationJNI.Joint_calcEquivalentSpatialForce(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(mobilityForces), mobilityForces), true);
  }

  public SpatialVec calcReactionOnParentExpressedInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.Joint_calcReactionOnParentExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public SpatialVec calcReactionOnChildExpressedInGround(State state) {
    return new SpatialVec(opensimModelSimulationJNI.Joint_calcReactionOnChildExpressedInGround(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public double calcPower(State s) {
    return opensimModelSimulationJNI.Joint_calcPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public void scale(ScaleSet aScaleSet) {
    opensimModelSimulationJNI.Joint_scale(swigCPtr, this, ScaleSet.getCPtr(aScaleSet), aScaleSet);
  }

}
