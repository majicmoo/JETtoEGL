class ItemProvider {
public static void main (String[] args) {
genClass.getProviderBaseClassName() != null ? genClass.getProviderBaseClassName() : genModel.getImportedName("org.eclipse.emf.edit.provider.ItemProviderAdapter");
genClass.getProviderBaseClassName() != null ? genClass.getProviderBaseClassName() : genModel.getImportedName("org.eclipse.emf.edit.provider.ItemProviderAdapter");
genFeature.getProperty() == GenPropertyKind.EDITABLE_LITERAL ? "true" : "false";
genFeature.isPropertyMultiLine() ? "true" : "false";
genFeature.isPropertySortChoices() ? "true" : "false";
genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<? extends org.eclipse.emf.ecore.EStructuralFeature>" : "java.util.Collection");
genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<java.lang.Object>" : "java.util.Collection");
genModel.getImportedName(genModel.useGenerics() ? "java.util.Collection<?>" : "java.util.Collection");
i.hasNext() ? " ||" : ";";

}
}