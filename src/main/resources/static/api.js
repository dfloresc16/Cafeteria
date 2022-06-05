async function crearReservacion(){
    let datos = {};
    datos.name = document.getElementById("nombre").value;
    datos.email = document.getElementById("email").value;
    datos.cellphone = document.getElementById("telefono").value;
    datos.noPeople = document.getElementById("cantidad").value;
    datos.schedule = document.getElementById("fecha").value;
    const request = await fetch('/cafeteria/reservacion', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const content = await rawResponse.json();
      console.log(content);

}

async function crearPedido(){
    let datos = {};
    datos.name = document.getElementById("nombre").value;
    datos.email = document.getElementById("email").value;
    datos.product = document.getElementById("producto").value;
    datos.cellphone = document.getElementById("telefono").value;
    datos.quantity = document.getElementById("cantidad").value;
    datos.address = document.getElementById("direccion").value;
    console.log(datos);
    const request = await fetch('/cafeteria/pedido', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const content = await rawResponse.json();
      console.log(content);
}