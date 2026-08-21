/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.JsonAdapter
 *  com.google.gson.annotations.SerializedName
 *  com.mojang.util.UUIDTypeAdapter
 */
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.util.UUIDTypeAdapter;
import java.util.UUID;

public class gay
extends gbx
implements gbp {
    @SerializedName(value="name")
    public final String a;
    @SerializedName(value="uuid")
    @JsonAdapter(value=UUIDTypeAdapter.class)
    public final UUID b;
    @SerializedName(value="operator")
    public boolean c;
    @SerializedName(value="accepted")
    public final boolean d;
    @SerializedName(value="online")
    public final boolean e;

    public gay(String $$0, UUID $$1, boolean $$2, boolean $$3, boolean $$4) {
        this.a = $$0;
        this.b = $$1;
        this.c = $$2;
        this.d = $$3;
        this.e = $$4;
    }
}

