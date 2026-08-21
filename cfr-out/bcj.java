/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.io.File;
import java.util.Objects;

public class bcj
extends bcf<bbx, bck> {
    public bcj(File $$0, ayy $$1) {
        super($$0, $$1);
    }

    @Override
    protected bce<bbx> a(JsonObject $$0) {
        return new bck($$0);
    }

    @Override
    public boolean a(bbx $$0) {
        return this.d($$0);
    }

    @Override
    public boolean a(bck $$0) {
        if (super.a($$0)) {
            if ($$0.h() != null) {
                this.a.a((bbx)$$0.h());
            }
            return true;
        }
        return false;
    }

    public boolean b(bbx $$0) {
        if (super.a($$0)) {
            this.a.b($$0);
            return true;
        }
        return false;
    }

    @Override
    public void a() {
        for (bck $$0 : this.e()) {
            if ($$0.h() == null) continue;
            this.a.b((bbx)$$0.h());
        }
        super.a();
    }

    @Override
    public String[] b() {
        return (String[])this.e().stream().map(bce::h).filter(Objects::nonNull).map(bbx::b).toArray(String[]::new);
    }

    @Override
    protected String c(bbx $$0) {
        return $$0.a().toString();
    }

    @Override
    protected /* synthetic */ String b(Object object) {
        return this.c((bbx)object);
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.b((bbx)object);
    }
}

