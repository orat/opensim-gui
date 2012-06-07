/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Muscle extends PathActuator {
  private long swigCPtr;

  public Muscle(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.Muscle_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Muscle obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Muscle(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Muscle safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.Muscle_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.Muscle_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.Muscle_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.Muscle_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.Muscle_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_max_isometric_force(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_max_isometric_force_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_max_isometric_force() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_max_isometric_force_get(swigCPtr, this), true);
  }

  public void copyProperty_max_isometric_force(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_max_isometric_force(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_max_isometric_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_getProperty_max_isometric_force(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_max_isometric_force() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_updProperty_max_isometric_force(swigCPtr, this), false);
  }

  public double get_max_isometric_force(int i) {
    return opensimModelJNI.Muscle_get_max_isometric_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_isometric_force(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_max_isometric_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_isometric_force(int i, double value) {
    opensimModelJNI.Muscle_set_max_isometric_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_isometric_force(double value) {
    return opensimModelJNI.Muscle_append_max_isometric_force(swigCPtr, this, value);
  }

  public void constructProperty_max_isometric_force(double initValue) {
    opensimModelJNI.Muscle_constructProperty_max_isometric_force(swigCPtr, this, initValue);
  }

  public double get_max_isometric_force() {
    return opensimModelJNI.Muscle_get_max_isometric_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_isometric_force() {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_max_isometric_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_isometric_force(double value) {
    opensimModelJNI.Muscle_set_max_isometric_force__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_optimal_fiber_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_optimal_fiber_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_optimal_fiber_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_optimal_fiber_length_get(swigCPtr, this), true);
  }

  public void copyProperty_optimal_fiber_length(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_optimal_fiber_length(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_optimal_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_getProperty_optimal_fiber_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_optimal_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_updProperty_optimal_fiber_length(swigCPtr, this), false);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimModelJNI.Muscle_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_optimal_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_fiber_length(int i, double value) {
    opensimModelJNI.Muscle_set_optimal_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_fiber_length(double value) {
    return opensimModelJNI.Muscle_append_optimal_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_optimal_fiber_length(double initValue) {
    opensimModelJNI.Muscle_constructProperty_optimal_fiber_length(swigCPtr, this, initValue);
  }

  public double get_optimal_fiber_length() {
    return opensimModelJNI.Muscle_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_optimal_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_fiber_length(double value) {
    opensimModelJNI.Muscle_set_optimal_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_tendon_slack_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_tendon_slack_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_tendon_slack_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_tendon_slack_length_get(swigCPtr, this), true);
  }

  public void copyProperty_tendon_slack_length(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_tendon_slack_length(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_tendon_slack_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_getProperty_tendon_slack_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_tendon_slack_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_updProperty_tendon_slack_length(swigCPtr, this), false);
  }

  public double get_tendon_slack_length(int i) {
    return opensimModelJNI.Muscle_get_tendon_slack_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_tendon_slack_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_tendon_slack_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_tendon_slack_length(int i, double value) {
    opensimModelJNI.Muscle_set_tendon_slack_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_tendon_slack_length(double value) {
    return opensimModelJNI.Muscle_append_tendon_slack_length(swigCPtr, this, value);
  }

  public void constructProperty_tendon_slack_length(double initValue) {
    opensimModelJNI.Muscle_constructProperty_tendon_slack_length(swigCPtr, this, initValue);
  }

  public double get_tendon_slack_length() {
    return opensimModelJNI.Muscle_get_tendon_slack_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_tendon_slack_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_tendon_slack_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_tendon_slack_length(double value) {
    opensimModelJNI.Muscle_set_tendon_slack_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_pennation_angle_at_optimal(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_pennation_angle_at_optimal_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_pennation_angle_at_optimal_get(swigCPtr, this), true);
  }

  public void copyProperty_pennation_angle_at_optimal(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_pennation_angle_at_optimal(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_getProperty_pennation_angle_at_optimal(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_updProperty_pennation_angle_at_optimal(swigCPtr, this), false);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimModelJNI.Muscle_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_pennation_angle_at_optimal(int i, double value) {
    opensimModelJNI.Muscle_set_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_pennation_angle_at_optimal(double value) {
    return opensimModelJNI.Muscle_append_pennation_angle_at_optimal(swigCPtr, this, value);
  }

  public void constructProperty_pennation_angle_at_optimal(double initValue) {
    opensimModelJNI.Muscle_constructProperty_pennation_angle_at_optimal(swigCPtr, this, initValue);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimModelJNI.Muscle_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_pennation_angle_at_optimal() {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_pennation_angle_at_optimal__SWIG_1(swigCPtr, this), false);
  }

  public void set_pennation_angle_at_optimal(double value) {
    opensimModelJNI.Muscle_set_pennation_angle_at_optimal__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_max_contraction_velocity(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_max_contraction_velocity_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_max_contraction_velocity() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_max_contraction_velocity_get(swigCPtr, this), true);
  }

  public void copyProperty_max_contraction_velocity(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_max_contraction_velocity(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_max_contraction_velocity() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_getProperty_max_contraction_velocity(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_max_contraction_velocity() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.Muscle_updProperty_max_contraction_velocity(swigCPtr, this), false);
  }

  public double get_max_contraction_velocity(int i) {
    return opensimModelJNI.Muscle_get_max_contraction_velocity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_contraction_velocity(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_max_contraction_velocity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_contraction_velocity(int i, double value) {
    opensimModelJNI.Muscle_set_max_contraction_velocity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_contraction_velocity(double value) {
    return opensimModelJNI.Muscle_append_max_contraction_velocity(swigCPtr, this, value);
  }

  public void constructProperty_max_contraction_velocity(double initValue) {
    opensimModelJNI.Muscle_constructProperty_max_contraction_velocity(swigCPtr, this, initValue);
  }

  public double get_max_contraction_velocity() {
    return opensimModelJNI.Muscle_get_max_contraction_velocity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_contraction_velocity() {
    return new SWIGTYPE_p_double(opensimModelJNI.Muscle_upd_max_contraction_velocity__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_contraction_velocity(double value) {
    opensimModelJNI.Muscle_set_max_contraction_velocity__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_ignore_tendon_compliance(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_ignore_tendon_compliance_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_ignore_tendon_compliance() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_ignore_tendon_compliance_get(swigCPtr, this), true);
  }

  public void copyProperty_ignore_tendon_compliance(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_ignore_tendon_compliance(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t getProperty_ignore_tendon_compliance() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.Muscle_getProperty_ignore_tendon_compliance(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t updProperty_ignore_tendon_compliance() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.Muscle_updProperty_ignore_tendon_compliance(swigCPtr, this), false);
  }

  public boolean get_ignore_tendon_compliance(int i) {
    return opensimModelJNI.Muscle_get_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_ignore_tendon_compliance(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Muscle_upd_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ignore_tendon_compliance(int i, boolean value) {
    opensimModelJNI.Muscle_set_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ignore_tendon_compliance(boolean value) {
    return opensimModelJNI.Muscle_append_ignore_tendon_compliance(swigCPtr, this, value);
  }

  public void constructProperty_ignore_tendon_compliance(boolean initValue) {
    opensimModelJNI.Muscle_constructProperty_ignore_tendon_compliance(swigCPtr, this, initValue);
  }

  public boolean get_ignore_tendon_compliance() {
    return opensimModelJNI.Muscle_get_ignore_tendon_compliance__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_ignore_tendon_compliance() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Muscle_upd_ignore_tendon_compliance__SWIG_1(swigCPtr, this), false);
  }

  public void set_ignore_tendon_compliance(boolean value) {
    opensimModelJNI.Muscle_set_ignore_tendon_compliance__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_ignore_activation_dynamics(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.Muscle_PropertyIndex_ignore_activation_dynamics_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_ignore_activation_dynamics() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.Muscle_PropertyIndex_ignore_activation_dynamics_get(swigCPtr, this), true);
  }

  public void copyProperty_ignore_activation_dynamics(Muscle source) {
    opensimModelJNI.Muscle_copyProperty_ignore_activation_dynamics(swigCPtr, this, Muscle.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t getProperty_ignore_activation_dynamics() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.Muscle_getProperty_ignore_activation_dynamics(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_bool_t updProperty_ignore_activation_dynamics() {
    return new SWIGTYPE_p_OpenSim__PropertyT_bool_t(opensimModelJNI.Muscle_updProperty_ignore_activation_dynamics(swigCPtr, this), false);
  }

  public boolean get_ignore_activation_dynamics(int i) {
    return opensimModelJNI.Muscle_get_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_ignore_activation_dynamics(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.Muscle_upd_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_ignore_activation_dynamics(int i, boolean value) {
    opensimModelJNI.Muscle_set_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_ignore_activation_dynamics(boolean value) {
    return opensimModelJNI.Muscle_append_ignore_activation_dynamics(swigCPtr, this, value);
  }

  public void constructProperty_ignore_activation_dynamics(boolean initValue) {
    opensimModelJNI.Muscle_constructProperty_ignore_activation_dynamics(swigCPtr, this, initValue);
  }

  public boolean get_ignore_activation_dynamics() {
    return opensimModelJNI.Muscle_get_ignore_activation_dynamics__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_ignore_activation_dynamics() {
    return new SWIGTYPE_p_bool(opensimModelJNI.Muscle_upd_ignore_activation_dynamics__SWIG_1(swigCPtr, this), false);
  }

  public void set_ignore_activation_dynamics(boolean value) {
    opensimModelJNI.Muscle_set_ignore_activation_dynamics__SWIG_1(swigCPtr, this, value);
  }

  public double getMaxIsometricForce() {
    return opensimModelJNI.Muscle_getMaxIsometricForce(swigCPtr, this);
  }

  public void setMaxIsometricForce(double maxIsometricForce) {
    opensimModelJNI.Muscle_setMaxIsometricForce(swigCPtr, this, maxIsometricForce);
  }

  public double getOptimalFiberLength() {
    return opensimModelJNI.Muscle_getOptimalFiberLength(swigCPtr, this);
  }

  public void setOptimalFiberLength(double optimalFiberLength) {
    opensimModelJNI.Muscle_setOptimalFiberLength(swigCPtr, this, optimalFiberLength);
  }

  public double getTendonSlackLength() {
    return opensimModelJNI.Muscle_getTendonSlackLength(swigCPtr, this);
  }

  public void setTendonSlackLength(double tendonSlackLength) {
    opensimModelJNI.Muscle_setTendonSlackLength(swigCPtr, this, tendonSlackLength);
  }

  public double getPennationAngleAtOptimalFiberLength() {
    return opensimModelJNI.Muscle_getPennationAngleAtOptimalFiberLength(swigCPtr, this);
  }

  public void setPennationAngleAtOptimalFiberLength(double pennationAngle) {
    opensimModelJNI.Muscle_setPennationAngleAtOptimalFiberLength(swigCPtr, this, pennationAngle);
  }

  public double getMaxContractionVelocity() {
    return opensimModelJNI.Muscle_getMaxContractionVelocity(swigCPtr, this);
  }

  public void setMaxContractionVelocity(double maxContractionVelocity) {
    opensimModelJNI.Muscle_setMaxContractionVelocity(swigCPtr, this, maxContractionVelocity);
  }

  public boolean getIgnoreTendonCompliance(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getIgnoreTendonCompliance(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setIgnoreTendonCompliance(SWIGTYPE_p_SimTK__State s, boolean ignore) {
    opensimModelJNI.Muscle_setIgnoreTendonCompliance(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ignore);
  }

  public boolean getIgnoreActivationDynamics(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getIgnoreActivationDynamics(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setIgnoreActivationDynamics(SWIGTYPE_p_SimTK__State s, boolean ignore) {
    opensimModelJNI.Muscle_setIgnoreActivationDynamics(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), ignore);
  }

  public double getActivation(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getActivation(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberLength(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberLength(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPennationAngle(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getPennationAngle(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonLength(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonLength(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getNormalizedFiberLength(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getNormalizedFiberLength(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberLengthAlongTendon(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberLengthAlongTendon(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonStrain(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonStrain(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberPotentialEnergy(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberPotentialEnergy(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonPotentialEnergy(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonPotentialEnergy(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getMusclePotentialEnergy(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getMusclePotentialEnergy(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPassiveForceMultiplier(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getPassiveForceMultiplier(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getActiveForceLengthMultiplier(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getActiveForceLengthMultiplier(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberVelocity(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberVelocity(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getNormalizedFiberVelocity(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getNormalizedFiberVelocity(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberVelocityAlongTendon(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberVelocityAlongTendon(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPennationAngularVelocity(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getPennationAngularVelocity(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonVelocity(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonVelocity(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getForceVelocityMultiplier(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getForceVelocityMultiplier(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getActiveFiberForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getActiveFiberForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPassiveFiberForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getPassiveFiberForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getActiveFiberForceAlongTendon(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getActiveFiberForceAlongTendon(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getPassiveFiberForceAlongTendon(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getPassiveFiberForceAlongTendon(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonForce(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonForce(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberStiffness(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberStiffness(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonStiffness(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonStiffness(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getMuscleStiffness(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getMuscleStiffness(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getFiberPower(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getFiberPower(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getTendonPower(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getTendonPower(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getMusclePower(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getMusclePower(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public double getStress(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getStress(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setExcitation(SWIGTYPE_p_SimTK__State s, double excitation) {
    opensimModelJNI.Muscle_setExcitation(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), excitation);
  }

  public double getExcitation(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_getExcitation(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void setActivation(SWIGTYPE_p_SimTK__State s, double activation) {
    opensimModelJNI.Muscle_setActivation(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s), activation);
  }

  public double computeActuation(SWIGTYPE_p_SimTK__State s) {
    return opensimModelJNI.Muscle_computeActuation(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

  public void equilibrate(SWIGTYPE_p_SimTK__State s) {
    opensimModelJNI.Muscle_equilibrate(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(s));
  }

}
