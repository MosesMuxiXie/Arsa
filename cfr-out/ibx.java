/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionfc
 */
import org.joml.Quaternionfc;

public class ibx
extends ian<ifu, hft> {
    public ibx(hyq<ifu, hft> $$0) {
        super($$0);
    }

    @Override
    protected void a(ifu $$0, fzm $$1) {
        if ($$0.c) {
            ((hft)this.d()).b().a($$1);
            ((gzp)((hft)this.d())).a($$1);
            ((hft)this.d()).f().a($$1);
            $$1.a(0.0625f, 0.25f, 0.0f);
            $$1.a((Quaternionfc)a.f.rotationDegrees(180.0f));
            $$1.a((Quaternionfc)a.b.rotationDegrees(140.0f));
            $$1.a((Quaternionfc)a.f.rotationDegrees(10.0f));
            $$1.a((Quaternionfc)a.b.rotationDegrees(180.0f));
            return;
        }
        super.a($$0, $$1);
    }
}

