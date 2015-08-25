<h6>Terméktípusok listája:</h6> List<WareWebVO> getAllWares()

<h6>Egy paraméterül kapott raktár alapján az elérhető terméktípusok listája és darabszáma:</h6>
Map < String, Integer > getWaresNumbers(String warehouseId)

<h6>Egy paraméterül kapott raktár és terméktípus alapján visszaadni a darabszámot:</h6>
int getNumberOfWares(String warehouseId, Long wareId)

<h6>Egy paraméterül kapott raktár, terméktípus és darabszám alapján csökkenteni a darabszámot az adott raktárban az adott terméktípusból:</h6>
void decreaseNumberOfWares(String warehouseId, Long wareId, int number)
