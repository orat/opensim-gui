/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ScaleTool extends OpenSimObject {
  private transient long swigCPtr;

  public ScaleTool(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.ScaleTool_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ScaleTool obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_ScaleTool(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ScaleTool safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ScaleTool(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ScaleTool(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getConcreteClassName(swigCPtr, this);
  }

  public ScaleTool() {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_0(), true);
  }

  public ScaleTool(String aFileName) throws java.io.IOException {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_1(aFileName), true);
  }

  public ScaleTool(ScaleTool aSubject) {
    this(opensimActuatorsAnalysesToolsJNI.new_ScaleTool__SWIG_2(ScaleTool.getCPtr(aSubject), aSubject), true);
  }

  public void copyData(ScaleTool aSubject) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_copyData(swigCPtr, this, ScaleTool.getCPtr(aSubject), aSubject);
  }

  public Model createModel() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.ScaleTool_createModel(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public GenericModelMaker getGenericModelMaker() {
    return new GenericModelMaker(opensimActuatorsAnalysesToolsJNI.ScaleTool_getGenericModelMaker(swigCPtr, this), false);
  }

  public ModelScaler getModelScaler() {
    return new ModelScaler(opensimActuatorsAnalysesToolsJNI.ScaleTool_getModelScaler(swigCPtr, this), false);
  }

  public MarkerPlacer getMarkerPlacer() {
    return new MarkerPlacer(opensimActuatorsAnalysesToolsJNI.ScaleTool_getMarkerPlacer(swigCPtr, this), false);
  }

  public boolean run() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_run(swigCPtr, this);
  }

  public boolean isDefaultGenericModelMaker() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultGenericModelMaker(swigCPtr, this);
  }

  public boolean isDefaultModelScaler() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultModelScaler(swigCPtr, this);
  }

  public boolean isDefaultMarkerPlacer() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_isDefaultMarkerPlacer(swigCPtr, this);
  }

  public static void registerTypes() {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_registerTypes();
  }

  public double getSubjectMass() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectMass(swigCPtr, this);
  }

  public double getSubjectAge() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectAge(swigCPtr, this);
  }

  public double getSubjectHeight() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getSubjectHeight(swigCPtr, this);
  }

  public void setSubjectMass(double mass) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectMass(swigCPtr, this, mass);
  }

  public void setSubjectAge(double age) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectAge(swigCPtr, this, age);
  }

  public void setSubjectHeight(double height) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setSubjectHeight(swigCPtr, this, height);
  }

  public String getPathToSubject() {
    return opensimActuatorsAnalysesToolsJNI.ScaleTool_getPathToSubject(swigCPtr, this);
  }

  public void setPathToSubject(String aPath) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setPathToSubject(swigCPtr, this, aPath);
  }

  public void setPrintResultFiles(boolean aToWrite) {
    opensimActuatorsAnalysesToolsJNI.ScaleTool_setPrintResultFiles(swigCPtr, this, aToWrite);
  }

}
