/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.brigadier.CommandDispatcher
 */
import com.google.gson.JsonElement;
import com.mojang.brigadier.CommandDispatcher;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class nf
implements mq {
    private final ms d;
    private final CompletableFuture<jf.a> e;

    public nf(ms $$0, CompletableFuture<jf.a> $$1) {
        this.d = $$0;
        this.e = $$1;
    }

    @Override
    public CompletableFuture<?> a(mo $$0) {
        Path $$1 = this.d.a(ms.b.c).resolve("commands.json");
        return this.e.thenCompose($$2 -> {
            CommandDispatcher<ed> $$3 = new ee(ee.a.a, ee.a($$2)).a();
            return mq.a($$0, (JsonElement)id.a($$3, $$3.getRoot()), $$1);
        });
    }

    @Override
    public final String a() {
        return "Command Syntax";
    }
}

