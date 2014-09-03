class ItemProviderAdapterFactory {
public static void main (String[] args) {
genModel.getImportedName(useGenerics ? "java.util.List<org.eclipse.emf.edit.provider.IChildCreationExtender>" : "java.util.List");
genModel.getImportedName(useGenerics ? "java.util.Collection<?>" : "java.util.Collection");
useGenerics ? "<Object>" : "";
genModel.getImportedName(useGenerics ? "java.util.List<Object>" : "java.util.List");
genModel.getImportedName(useGenerics ? "java.util.List<Object>" : "java.util.List");

}
}