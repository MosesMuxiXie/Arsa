/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.base.Splitter;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;

public class iml {
    private static final Logger b = LogUtils.getLogger();
    public static final Splitter a = Splitter.on((char)'/');

    public static Path a(Path $$0, String $$1) {
        Path $$2 = $$0.resolve("objects");
        azv.a $$3 = azv.c();
        Path $$4 = $$0.resolve("indexes/" + $$1 + ".json");
        try (BufferedReader $$5 = Files.newBufferedReader($$4, StandardCharsets.UTF_8);){
            JsonObject $$6 = bfv.a($$5);
            JsonObject $$7 = bfv.a($$6, "objects", null);
            if ($$7 != null) {
                for (Map.Entry $$8 : $$7.entrySet()) {
                    JsonObject $$9 = (JsonObject)$$8.getValue();
                    String $$10 = (String)$$8.getKey();
                    List $$11 = a.splitToList((CharSequence)$$10);
                    String $$12 = bfv.i($$9, "hash");
                    Path $$13 = $$2.resolve($$12.substring(0, 2) + "/" + $$12);
                    $$3.a($$11, $$13);
                }
            }
        }
        catch (JsonParseException $$14) {
            b.error("Unable to parse resource index file: {}", (Object)$$4);
        }
        catch (IOException $$15) {
            b.error("Can't open the resource index file: {}", (Object)$$4);
        }
        return $$3.a("index-" + $$1).getPath("/", new String[0]);
    }
}

