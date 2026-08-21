/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 */
import com.mojang.brigadier.StringReader;

public class byy
extends byd<StringReader> {
    private final StringReader a;

    public byy(byh<StringReader> $$0, StringReader $$1) {
        super($$0);
        this.a = $$1;
    }

    public StringReader h() {
        return this.a;
    }

    @Override
    public int g() {
        return this.a.getCursor();
    }

    @Override
    public void a(int $$0) {
        this.a.setCursor($$0);
    }

    @Override
    public /* synthetic */ Object f() {
        return this.h();
    }
}

