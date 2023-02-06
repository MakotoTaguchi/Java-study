package jp.co.funatz.pkgTest;

import jp.co.funatz.pkgTest.a.PackageA;
// import jp.co.funatz.pkgTest.a.PackageZ;
import jp.co.funatz.pkgTest.b.PackageB;
// import jp.co.funatz.pkgTest.b.PackageZ;

public class PackageTest {
    public static void main(String[] args) {
        PackageA.a();
        PackageB.b();
        jp.co.funatz.pkgTest.a.PackageZ.z();
        jp.co.funatz.pkgTest.b.PackageZ.z();
    }
}
