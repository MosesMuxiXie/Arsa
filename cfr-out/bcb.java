/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;

public class bcb
extends bcf<bbx, bcc> {
    public bcb(File $$0, ayy $$1) {
        super($$0, $$1);
    }

    @Override
    protected bce<bbx> a(JsonObject $$0) {
        return new bcc($$0);
    }

    @Override
    public String[] b() {
        return (String[])this.e().stream().map(bce::h).filter(Objects::nonNull).map(bbx::b).toArray(String[]::new);
    }

    @Override
    public boolean a(bcc $$0) {
        if (super.a($$0)) {
            if ($$0.h() != null) {
                this.a.a($$0);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(bbx $$0) {
        bcc $$1 = (bcc)this.c($$0);
        if (super.a($$0)) {
            if ($$1 != null) {
                this.a.b($$1);
            }
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        for (bcc $$0 : this.e()) {
            if ($$0.h() == null) continue;
            this.a.b($$0);
        }
        super.a();
    }

    public boolean b(bbx $$0) {
        bcc $$1 = (bcc)this.c($$0);
        if ($$1 != null) {
            return $$1.b();
        }
        return false;
    }

    @Override
    protected String c(bbx $$0) {
        return $$0.a().toString();
    }

    @Override
    protected /* synthetic */ String b(Object object) {
        return this.c((bbx)object);
    }
}

