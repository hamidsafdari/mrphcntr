package com.hs.mrphcntr

import androidx.compose.ui.graphics.vector.PathParser
import org.junit.Test

class ExampleUnitTest {
    @Test
    // not intended to test anything
    fun svgPathToPathNodes() {
        val digits = listOf(
            "M 9.5711,149.46543 C 9.4772,86.81623 23.8726,8.74773 91.5763,4.53473 177.6464,-0.82107 202.5491,76.67563 200.7606,153.58433 200.2051,194.06073 190.073,297.12078 100.9805,292.54051 20.6571,288.41107 9.6441,198.09063 9.5711,149.46543",
            "M 70.96325,59.18415 C 70.96325,59.18415 94.64565,46.46215 105.16455,38.20135 117.79115,28.28515 105.16455,38.20135 139.36595,4.28765 139.36595,4.28765 139.36595,94.72995 139.36595,139.95105 139.36595,190.87135 139.36595,292.71185 139.36595,292.71185",
            "M 20.1064,73.93557 C 20.0159,34.525 63.4161,9.7031 97.6948,4.9576 126.7435,0.9361 169.1022,15.0676 176.8528,43.35068 203.1914,139.46402 106.1723,210.9431 11.9447,292.72749 95.8437,292.72749 136.0465,292.72449 198.0819,292.71549",
            "M 35.0707,4.27402 C 35.0707,4.27402 84.0763,4.27402 108.5791,4.27402 134.1587,4.27402 185.318,4.27402 185.318,4.27402 130.7398,77.29711 128.6435,80.20258 103.6807,113.70261 313.538,97.84669 144.3483,418.1831 7.7136,237.02686",
            "M 205.80476,192.59182 C 205.80476,192.59182 55.25923,192.92034 4.1948476,192.59182 27.430317,159.61295 102.25792,54.636836 138.45938,4.1952421 138.45938,53.311994 138.45938,130.20089 138.45938,193.20371 138.45938,224.2571 138.45938,286.36387 138.45938,286.36387",
            "M 173.2887,4.298099 C 173.2887,4.298099 57.235402,4.298099 36.559902,4.298099 32.553402,39.855799 27.300002,86.480099 22.670002,127.5711 98.069502,59.533499 236.7401,120.7315 192.3053,235.49644 160.0425,315.53808 31.280502,307.4445 9.2142025,236.95416",
            "M 180.6085,46.41543 C 170.477,8.05393 78.6828,-26.9429 37.3649,48.81914 15.5501,93.86806 13.4856,147.64663 19.1209,196.8542 23.999,90.50136 196.8706,87.98967 193.5056,204.21197 190.5619,305.87852 37.5273,340.55817 19.1209,196.8542",
            "M 9.0506,4.28824 C 9.0506,4.28824 72.4102,4.28824 104.09,4.28824 136.4559,4.28824 171.1942,4.28824 201.1878,4.28824 180.111,48.58288 156.1061,99.03131 133.5652,146.40285 110.3591,195.17249 63.9469,292.71177 63.9469,292.71177",
            "M 103.98236,123.90755 C -10.87144,105.65558 -0.2418397,8.938676 100.41516,4.221746 193.70096,-0.149754 235.81526,100.54044 104.01286,123.9475 220.75826,135.92096 245.49376,289.88455 105.21576,292.55385 -30.73964,295.61275 -15.84014,137.13145 104.04336,123.98745",
            "M 193.46807,99.965398 C 167.49757,220.1301 32.916265,191.7158 18.409165,112.7041 0.69586503,52.194498 66.214065,-11.498302 126.35267,7.7129978 220.95387,28.513598 195.25847,189.8978 177.09557,239.7362 153.55747,311.24389 41.825865,305.84029 28.447965,251.2339"
        )
        for (digitPath in digits) {
            val nodes = PathParser().parsePathString(digitPath).toNodes()
            for (node in nodes) {
                println(node)
            }
        }
    }
}