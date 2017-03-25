/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class GenericModelMaker extends OpenSimObject {
  private transient long swigCPtr;

  public GenericModelMaker(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.GenericModelMaker_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(GenericModelMaker obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_GenericModelMaker(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static GenericModelMaker safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.GenericModelMaker_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new GenericModelMaker(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.GenericModelMaker_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.GenericModelMaker_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.GenericModelMaker_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new GenericModelMaker(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.GenericModelMaker_getConcreteClassName(swigCPtr, this);
  }

  public GenericModelMaker() {
    this(opensimActuatorsAnalysesToolsJNI.new_GenericModelMaker__SWIG_0(), true);
  }

  public GenericModelMaker(GenericModelMaker aGenericModelMaker) {
    this(opensimActuatorsAnalysesToolsJNI.new_GenericModelMaker__SWIG_1(GenericModelMaker.getCPtr(aGenericModelMaker), aGenericModelMaker), true);
  }

  public void copyData(GenericModelMaker aGenericModelMaker) {
    opensimActuatorsAnalysesToolsJNI.GenericModelMaker_copyData(swigCPtr, this, GenericModelMaker.getCPtr(aGenericModelMaker), aGenericModelMaker);
  }

  public Model processModel(String aPathToSubject) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.GenericModelMaker_processModel__SWIG_0(swigCPtr, this, aPathToSubject);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public Model processModel() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.GenericModelMaker_processModel__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public static void registerTypes() {
    opensimActuatorsAnalysesToolsJNI.GenericModelMaker_registerTypes();
  }

  public String getModelFileName() {
    return opensimActuatorsAnalysesToolsJNI.GenericModelMaker_getModelFileName(swigCPtr, this);
  }

  public void setModelFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.GenericModelMaker_setModelFileName(swigCPtr, this, aFileName);
  }

  public String getMarkerSetFileName() {
    return opensimActuatorsAnalysesToolsJNI.GenericModelMaker_getMarkerSetFileName(swigCPtr, this);
  }

  public void setMarkerSetFileName(String aFileName) {
    opensimActuatorsAnalysesToolsJNI.GenericModelMaker_setMarkerSetFileName(swigCPtr, this, aFileName);
  }

}
