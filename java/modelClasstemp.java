class modelClass {
public static void main (String[] args) {
genClass.getFlagSize(genFeature) > 1 ? "s" : "";
genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size();
genClass.getClassExtendsGenClass() == null ? "0" : genClass.hasStaticFeatures() ? "ESTATIC_FEATURE_COUNT" : Integer.toString(genClass.getClassExtendsGenClass().getAllGenFeatures().size());
genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "";
setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName();
setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName();
genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "";
setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName();
genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException");
genClass.getQualifiedOperationID(overrideGenOperation != null ? overrideGenOperation : genOperation);
genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException");
genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass);
genParameter.usesOperationTypeParameters() ? genParameter.getRawImportedType() : genParameter.getObjectType(genClass);
genModel.getImportedName(isGWT ? "org.eclipse.emf.common.util.InvocationTargetException" : "java.lang.reflect.InvocationTargetException");
isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName();

}
}