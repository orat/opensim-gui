/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetJoints extends SetJoints {
  private transient long swigCPtr;

  public ModelComponentSetJoints(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetJoints_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetJoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetJoints(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetJoints safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetJoints_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetJoints(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetJoints_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetJoints_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetJoints_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetJoints(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetJoints_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetJoints() {
    this(opensimSimulationJNI.new_ModelComponentSetJoints__SWIG_0(), true);
  }

  public ModelComponentSetJoints(Model model) {
    this(opensimSimulationJNI.new_ModelComponentSetJoints__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetJoints(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ModelComponentSetJoints__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetJoints(Model model, String fileName) {
    this(opensimSimulationJNI.new_ModelComponentSetJoints__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetJoints(ModelComponentSetJoints source) {
    this(opensimSimulationJNI.new_ModelComponentSetJoints__SWIG_4(ModelComponentSetJoints.getCPtr(source), source), true);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponentSetJoints_hasModel(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetJoints_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetJoints_updModel(swigCPtr, this), false);
  }

  public void setModel(Model model) {
    opensimSimulationJNI.ModelComponentSetJoints_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public boolean insert(int aIndex, Joint aObject) {
    return opensimSimulationJNI.ModelComponentSetJoints_insert(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Joint aObject, boolean preserveGroups) {
    return opensimSimulationJNI.ModelComponentSetJoints_set__SWIG_0(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Joint aObject) {
    return opensimSimulationJNI.ModelComponentSetJoints_set__SWIG_1(swigCPtr, this, aIndex, Joint.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimSimulationJNI.ModelComponentSetJoints_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimSimulationJNI.ModelComponentSetJoints_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimSimulationJNI.ModelComponentSetJoints_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.ModelComponentSetJoints_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
