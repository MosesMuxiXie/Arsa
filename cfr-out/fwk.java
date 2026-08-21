/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.lwjgl.openal.AL10
 *  org.lwjgl.openal.ALC10
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.openal.AL10;
import org.lwjgl.openal.ALC10;
import org.slf4j.Logger;

public class fwk {
    private static final Logger a = LogUtils.getLogger();

    private static String a(int $$0) {
        switch ($$0) {
            case 40961: {
                return "Invalid name parameter.";
            }
            case 40962: {
                return "Invalid enumerated parameter value.";
            }
            case 40963: {
                return "Invalid parameter parameter value.";
            }
            case 40964: {
                return "Invalid operation.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
        }
        return "An unrecognized error occurred.";
    }

    static boolean a(String $$0) {
        int $$1 = AL10.alGetError();
        if ($$1 != 0) {
            a.error("{}: {}", (Object)$$0, (Object)fwk.a($$1));
            return true;
        }
        return false;
    }

    private static String b(int $$0) {
        switch ($$0) {
            case 40961: {
                return "Invalid device.";
            }
            case 40962: {
                return "Invalid context.";
            }
            case 40964: {
                return "Invalid value.";
            }
            case 40963: {
                return "Illegal enum.";
            }
            case 40965: {
                return "Unable to allocate memory.";
            }
        }
        return "An unrecognized error occurred.";
    }

    static boolean a(long $$0, String $$1) {
        int $$2 = ALC10.alcGetError((long)$$0);
        if ($$2 != 0) {
            a.error("{} ({}): {}", new Object[]{$$1, $$0, fwk.b($$2)});
            return true;
        }
        return false;
    }

    static int a(AudioFormat $$0) {
        AudioFormat.Encoding $$1 = $$0.getEncoding();
        int $$2 = $$0.getChannels();
        int $$3 = $$0.getSampleSizeInBits();
        if ($$1.equals(AudioFormat.Encoding.PCM_UNSIGNED) || $$1.equals(AudioFormat.Encoding.PCM_SIGNED)) {
            if ($$2 == 1) {
                if ($$3 == 8) {
                    return 4352;
                }
                if ($$3 == 16) {
                    return 4353;
                }
            } else if ($$2 == 2) {
                if ($$3 == 8) {
                    return 4354;
                }
                if ($$3 == 16) {
                    return 4355;
                }
            }
        }
        throw new IllegalArgumentException("Invalid audio format: " + String.valueOf($$0));
    }
}

