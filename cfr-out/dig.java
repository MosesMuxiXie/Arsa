/*
 * Decompiled with CFR 0.152.
 */
public class dig
extends dji {
    private final dhk a;

    public dig(dhk $$0, ccv $$1, int $$2, int $$3, int $$4) {
        super($$1, $$2, $$3, $$4);
        this.a = $$0;
    }

    @Override
    public boolean a(dlt $$0) {
        return this.a.c($$0) || dig.c($$0);
    }

    @Override
    public int b_(dlt $$0) {
        return dig.c($$0) ? 1 : super.b_($$0);
    }

    public static boolean c(dlt $$0) {
        return $$0.a(dlx.sk);
    }
}

