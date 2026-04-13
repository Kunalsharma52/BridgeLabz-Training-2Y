import java.util.*;

class FileNode {
    String name;
    int size;
    boolean isFile;
    List<FileNode> children;

    FileNode(String name, int size, boolean isFile) {
        this.name = name;
        this.size = size;
        this.isFile = isFile;
        this.children = new ArrayList<>();
    }
}

public class DirectorySizeCalculator {

    static int getSize(FileNode node) {

        // Base case
        if (node.isFile)
            return node.size;

        int total = 0;

        // Recursive case
        for (FileNode child : node.children) {
            total += getSize(child);
        }

        return total;
    }

    public static void main(String[] args) {

        FileNode project = new FileNode("project", 0, false);

        FileNode src = new FileNode("src", 0, false);
        src.children.add(new FileNode("main.java", 100, true));
        src.children.add(new FileNode("utils.java", 50, true));

        FileNode docs = new FileNode("docs", 0, false);
        docs.children.add(new FileNode("readme.txt", 10, true));

        FileNode guides = new FileNode("guides", 0, false);
        guides.children.add(new FileNode("setup.pdf", 200, true));

        docs.children.add(guides);

        project.children.add(src);
        project.children.add(docs);
        project.children.add(new FileNode("config.xml", 20, true));

        System.out.println("Total Size: " + getSize(project) + " KB");
    }
}