class PackageClass {
public static void main (String[] args) {
genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getRawImportedInterfaceName() + genClass.getInterfaceWildTypeArguments();
genClass.isMapEntry() ? genClass.getImportedClassName() : genClass.getImportedWildcardInstanceClassName();
genEnum.getImportedName().equals(genEnum.getClassifierID()) ? genEnum.getQualifiedName() : genEnum.getImportedName();
k.hasNext() ? "," : "";
l.hasNext() ? "," : "";
isInterface ? genPackage.getPackageInterfaceName() : genPackage.getPackageClassName();

}
}