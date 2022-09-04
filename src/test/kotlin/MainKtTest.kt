import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun masterMaestro_lowCash() {
        //arrange
        val cash = 10000
        val totalCash = 0
        val expectedRes = 0

        //act
        val result = masterMaestro(transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun masterMaestro_highCash() {
        //arrange
        val cash = 8000000
        val totalCash = 0
        val expectedRes = 50000

        //act
        val result = masterMaestro(transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun visaMir_lowCash() {
        //arrange
        val cash = 10000
        val expectedRes = 3500

        //act
        val result = visaMir(transferCash = cash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun visaMir_highCash() {
        //arrange
        val cash = 1000000
        val expectedRes = 7500

        //act
        val result = visaMir(transferCash = cash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun inLimit_firstRawLowCash() {
        //arrange
        val card = 1
        val cash = 15000000
        val totalCash = 10000000
        val expectedRes = true

        //act
        val result = inLimit(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun inLimit_firstRawHighCash() {
        //arrange
        val card = 1
        val cash = 15000000
        val totalCash = 50000000
        val expectedRes = false

        //act
        val result = inLimit(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun inLimit_secondRawLowCash() {
        //arrange
        val card = 3
        val cash = 1500000
        val totalCash = 1000000
        val expectedRes = true

        //act
        val result = inLimit(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun inLimit_secondRawHighCash() {
        //arrange
        val card = 3
        val cash = 1500000
        val totalCash = 4000000
        val expectedRes = false

        //act
        val result = inLimit(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun inLimit_thirdRaw() {
        //arrange
        val card = 4
        val cash = 150000
        val totalCash = 0
        val expectedRes = false

        //act
        val result = inLimit(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun fees_firstRaw() {
        //arrange
        val card = 1
        val cash = 120000
        val totalCash = 0
        val expectedRes = 0

        //act
        val result = fees(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun fees_secondRaw() {
        //arrange
        val card = 2
        val cash = 120000
        val totalCash = 0
        val expectedRes = 35000 // in original 3500

        //act
        val result = fees(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }

    @Test
    fun fees_thirdRaw() {
        //arrange
        val card = 3
        val cash = 120000
        val totalCash = 0
        val expectedRes = 0

        //act
        val result = fees(typeCard = card, transferCash = cash, totalMonthTransfer = totalCash)

        //assert
        assertEquals(expectedRes, result)
    }
}