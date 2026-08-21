/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public interface dvk {
    public void a(@Nullable ddm var1);

    public @Nullable ddm a();

    public dvm b();

    public void a(dvm var1);

    public void a(dvl var1);

    public void a(dlt var1);

    public int d();

    public void a(int var1);

    public boolean e();

    public bcz f();

    default public boolean gV() {
        return false;
    }

    default public void a(ddm $$02, yh $$12, int $$22) {
        dvm $$4;
        OptionalInt $$3 = $$02.a(new cdl(($$0, $$1, $$2) -> new diu($$0, $$1, this), $$12));
        if ($$3.isPresent() && !($$4 = this.b()).isEmpty()) {
            $$02.a($$3.getAsInt(), $$4, $$22, this.d(), this.e(), this.gV());
        }
    }

    public boolean c();

    public boolean b(ddm var1);
}

