/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collection;
import org.slf4j.Logger;

public class gew {
    private static final Logger a = LogUtils.getLogger();
    private static final int b = 50;
    private static final String c = "command_history.txt";
    private final Path d;
    private final beo<String> e = new beo(50);

    public gew(Path $$0) {
        this.d = $$0.resolve(c);
        if (Files.exists(this.d, new LinkOption[0])) {
            try (BufferedReader $$1 = Files.newBufferedReader(this.d, StandardCharsets.UTF_8);){
                this.e.addAll($$1.lines().toList());
            }
            catch (Exception $$2) {
                a.error("Failed to read {}, command history will be missing", (Object)c, (Object)$$2);
            }
        }
    }

    public void a(String $$0) {
        if (!$$0.equals(this.e.peekLast())) {
            if (this.e.size() >= 50) {
                this.e.removeFirst();
            }
            this.e.addLast($$0);
            this.b();
        }
    }

    private void b() {
        try (BufferedWriter $$0 = Files.newBufferedWriter(this.d, StandardCharsets.UTF_8, new OpenOption[0]);){
            for (String $$1 : this.e) {
                $$0.write($$1);
                $$0.newLine();
            }
        }
        catch (IOException $$2) {
            a.error("Failed to write {}, command history will be missing", (Object)c, (Object)$$2);
        }
    }

    public Collection<String> a() {
        return this.e;
    }
}

