console.log("Website Loaded");

function showMessage(event){

    event.preventDefault();

    document.getElementById("confirmation").innerHTML =
    "Registration Successful!";
}

function validatePhone(){

    let phone =
    document.getElementById("phone").value;

    if(phone.length != 10){

        alert("Phone number must be 10 digits");

    }
}

function showFee(){

    let eventType =
    document.getElementById("eventType").value;

    let feeText = "";

    if(eventType == "Music"){
        feeText = "Fee: ₹500";
    }

    else if(eventType == "Dance"){
        feeText = "Fee: ₹300";
    }

    else if(eventType == "Food"){
        feeText = "Fee: ₹200";
    }

    document.getElementById("fee").innerHTML = feeText;
}

function enlargeImage(img){

    img.style.width = "300px";
    img.style.height = "300px";
}

function countCharacters(){

    let text =
    document.getElementById("feedback").value;

    document.getElementById("charCount").innerHTML =
    "Characters: " + text.length;
}

function videoReady(){

    alert("Video Ready to Play");
}

function savePreference(){

    let selectedEvent =
        document.getElementById("eventType").value;

    localStorage.setItem(
        "preferredEvent",
        selectedEvent
    );

}

window.onload = function () {

    let savedEvent =
        localStorage.getItem("preferredEvent");

    if(savedEvent){

        document.getElementById("eventType").value =
            savedEvent;

    }

}

function clearPreferences(){

    localStorage.clear();

    sessionStorage.clear();

    alert("Preferences Cleared");

}

function findLocation(){

    navigator.geolocation.getCurrentPosition(

        showPosition,

        showError,

        {
            enableHighAccuracy: true,
            timeout: 5000,
            maximumAge: 0
        }

    );

}

function showPosition(position){

    document.getElementById("location").innerHTML =

        "Latitude: " +
        position.coords.latitude +

        "<br><br>Longitude: " +

        position.coords.longitude;

}

function showError(error){

    switch(error.code){

        case error.PERMISSION_DENIED:
            alert("Location access denied by user.");
            break;

        case error.POSITION_UNAVAILABLE:
            alert("Location unavailable.");
            break;

        case error.TIMEOUT:
            alert("Request timed out.");
            break;

        default:
            alert("Unknown error occurred.");
    }

}

function confirmLeave(){

    return "You have unsaved changes.";
}

function clearPreferences(){

    localStorage.clear();
    sessionStorage.clear();

    alert("Preferences Cleared");
}

