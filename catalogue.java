let search = document.getElementById("search");

let category = document.getElementById("category");

let cards = document.querySelectorAll(".card");


function filterProducts() {

    let text = search.value.toLowerCase();

    let type = category.value;


    cards.forEach(function(card) {

        let name = card.querySelector("h3").innerText.toLowerCase();

        let cardType = card.dataset.category;


        if (
            name.includes(text) &&
            (type === "all" || type === cardType)
        ) {

            card.style.display = "block";

        } else {

            card.style.display = "none";

        }

    });

}


search.addEventListener("input", filterProducts);

category.addEventListener("change", filterProducts);


let buttons = document.querySelectorAll("button");


buttons.forEach(function(button) {

    button.addEventListener("click", function() {

        if (button.innerText === "Add to Cart") {

            alert("Product added to cart");

        }

    });

});