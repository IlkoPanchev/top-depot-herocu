package warehouse.utils.file;

import java.io.IOException;

public interface FileIOUtil {
    String readFileContent(String filePath) throws IOException;
    void write(String content, String filePath) throws IOException;
}
