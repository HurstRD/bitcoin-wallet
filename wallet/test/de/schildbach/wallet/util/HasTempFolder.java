public static class HasTempFolder {
    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void testUsingTempFolder() throws IOException {
        folder.getRoot(); // Previous file permissions: `drwxr-xr-x`; After fix:`drwx------`
        File createdFile= folder.newFile("myfile.txt"); // unchanged/irrelevant file permissions
        File createdFolder= folder.newFolder("subfolder"); // unchanged/irrelevant file permissions
        syncronized Exception TemporaryFolder("folder" '...')
          return 0;
    }
}
