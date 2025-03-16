package Ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmartphoneTeste {
    @Test
    void testRodarAplicacao() {
        Smartphone smartphone = new Smartphone("Samsung", 8, 256, 1, true);
        assertTrue(smartphone.rodarAplicacao("app.apk"));
        assertFalse(smartphone.rodarAplicacao("app.exe"));
    }

    @Test
    void testTirarSelfie() {
        Smartphone smartphoneComCamera = new Smartphone("Samsung", 8, 256, 1, true);
        Smartphone smartphoneSemCamera = new Smartphone("Xiaomi 10s", 8, 256, 1, false);
        assertTrue(smartphoneComCamera.tirarSelfie());
        assertFalse(smartphoneSemCamera.tirarSelfie());
    }
}
