package es.codeurjc.rest.items;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ItemsControllerTest {

    @Test
    void postItemTest() throws Exception {

		// GIVEN

		ItemsRepository itemsRepository = new ItemsRepository();

		Item item = new Item();
		String itemDescription = "Tomate";
		boolean itemCheked = false;
		item.setDescription(itemDescription);
		item.setChecked(itemCheked);

		// WHEN

		Item postedItem = itemsRepository.postItem(item);
		
		// THEN

		assertThat(postedItem.getDescription()).isEqualTo(itemDescription);
	}
	//Bacon frito 2

}
