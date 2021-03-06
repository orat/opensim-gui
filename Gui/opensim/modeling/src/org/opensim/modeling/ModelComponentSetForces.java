/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetForces extends SetForces {
  private transient long swigCPtr;

  public ModelComponentSetForces(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetForces_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetForces obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetForces(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetForces safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetForces_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetForces(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetForces_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetForces_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetForces_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetForces(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetForces_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetForces() {
    this(opensimSimulationJNI.new_ModelComponentSetForces__SWIG_0(), true);
  }

  public ModelComponentSetForces(Model model) {
    this(opensimSimulationJNI.new_ModelComponentSetForces__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetForces(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ModelComponentSetForces__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetForces(Model model, String fileName) {
    this(opensimSimulationJNI.new_ModelComponentSetForces__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetForces(ModelComponentSetForces source) {
    this(opensimSimulationJNI.new_ModelComponentSetForces__SWIG_4(ModelComponentSetForces.getCPtr(source), source), true);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponentSetForces_hasModel(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetForces_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetForces_updModel(swigCPtr, this), false);
  }

  public void setModel(Model model) {
    opensimSimulationJNI.ModelComponentSetForces_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public boolean insert(int aIndex, Force aObject) {
    return opensimSimulationJNI.ModelComponentSetForces_insert(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Force aObject, boolean preserveGroups) {
    return opensimSimulationJNI.ModelComponentSetForces_set__SWIG_0(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Force aObject) {
    return opensimSimulationJNI.ModelComponentSetForces_set__SWIG_1(swigCPtr, this, aIndex, Force.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimSimulationJNI.ModelComponentSetForces_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimSimulationJNI.ModelComponentSetForces_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimSimulationJNI.ModelComponentSetForces_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.ModelComponentSetForces_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
