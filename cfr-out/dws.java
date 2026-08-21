/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import org.slf4j.Logger;

public final class dws {
    private static final Logger a = LogUtils.getLogger();
    private final String b;
    private final dwl c;
    private final boolean d;
    private final ccz e;
    private final boolean f;
    private final eua g;
    private final dxm h;

    public dws(String $$0, dwl $$1, boolean $$2, ccz $$3, boolean $$4, eua $$5, dxm $$6) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
        this.e = $$3;
        this.f = $$4;
        this.g = $$5;
        this.h = $$6;
    }

    public static dws a(Dynamic<?> $$02, dxm $$1) {
        dwl $$2 = dwl.a($$02.get("GameType").asInt(0));
        return new dws($$02.get("LevelName").asString(""), $$2, $$02.get("hardcore").asBoolean(false), $$02.get("Difficulty").asNumber().map($$0 -> ccz.a($$0.byteValue())).result().orElse(ccz.c), $$02.get("allowCommands").asBoolean($$2 == dwl.b), (eua)eua.a($$1.b()).parse($$02.get("game_rules").orElseEmptyMap()).resultOrPartial(arg_0 -> ((Logger)a).warn(arg_0)).orElseThrow(), $$1);
    }

    public String a() {
        return this.b;
    }

    public dwl b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public ccz d() {
        return this.e;
    }

    public boolean e() {
        return this.f;
    }

    public eua f() {
        return this.g;
    }

    public dxm g() {
        return this.h;
    }

    public dws a(dwl $$0) {
        return new dws(this.b, $$0, this.d, this.e, this.f, this.g, this.h);
    }

    public dws a(ccz $$0) {
        return new dws(this.b, this.c, this.d, $$0, this.f, this.g, this.h);
    }

    public dws a(dxm $$0) {
        return new dws(this.b, this.c, this.d, this.e, this.f, this.g, $$0);
    }

    public dws h() {
        return new dws(this.b, this.c, this.d, this.e, this.f, this.g.b(this.h.b()), this.h);
    }
}

