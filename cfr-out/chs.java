/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 *  org.jspecify.annotations.Nullable
 */
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import org.jspecify.annotations.Nullable;

public interface chs {
    public @Nullable cgr<chl> ae_();

    public dwo ao();

    default public @Nullable chl U_() {
        return cgr.b(this.ae_(), this.ao());
    }

    default public @Nullable chl V_() {
        ObjectArraySet $$0 = new ObjectArraySet();
        chl $$1 = this.U_();
        $$0.add(this);
        while ($$1 instanceof chs) {
            chs $$2 = (chs)((Object)$$1);
            chl $$3 = $$2.U_();
            if ($$0.contains($$3)) {
                return null;
            }
            $$0.add($$1);
            $$1 = $$2.U_();
        }
        return $$1;
    }
}

