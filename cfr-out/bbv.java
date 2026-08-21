/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.net.SocketAddress;
import org.jspecify.annotations.Nullable;

public class bbv
extends bcf<String, bbw> {
    public bbv(File $$0, ayy $$1) {
        super($$0, $$1);
    }

    @Override
    protected bce<String> a(JsonObject $$0) {
        return new bbw($$0);
    }

    @Override
    public boolean a(SocketAddress $$0) {
        String $$1 = this.c($$0);
        return this.d($$1);
    }

    @Override
    public boolean a(String $$0) {
        return this.d($$0);
    }

    public @Nullable bbw b(SocketAddress $$0) {
        String $$1 = this.c($$0);
        return (bbw)this.c($$1);
    }

    @Override
    private String c(SocketAddress $$0) {
        String $$1 = $$0.toString();
        if ($$1.contains("/")) {
            $$1 = $$1.substring($$1.indexOf(47) + 1);
        }
        if ($$1.contains(":")) {
            $$1 = $$1.substring(0, $$1.indexOf(58));
        }
        return $$1;
    }

    @Override
    public boolean a(bbw $$0) {
        if (super.a($$0)) {
            if ($$0.h() != null) {
                this.a.a($$0);
            }
            return true;
        }
        return false;
    }

    public boolean b(String $$0) {
        if (super.a($$0)) {
            this.a.a($$0);
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        for (bbw $$0 : this.e()) {
            if ($$0.h() == null) continue;
            this.a.a((String)$$0.h());
        }
        super.a();
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((String)object);
    }
}

