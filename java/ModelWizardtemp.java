class ModelWizard {
public static void main (String[] args) {
genModel.isSuppressEMFMetaData() ? genModel.getImportedName("org.eclipse.emf.ecore.EPackage") : genPackage.getPackageInterfaceName();
genModel.isSuppressEMFMetaData() ? genModel.getImportedName("org.eclipse.emf.ecore.EFactory") : genPackage.getFactoryInterfaceName();
genModel.isSuppressEMFMetaData() ? "EFactoryInstance" : genPackage.getFactoryName();

}
}