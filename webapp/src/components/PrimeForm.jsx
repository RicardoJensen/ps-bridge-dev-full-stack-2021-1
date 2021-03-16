import React from "react";
import Service from "../services/Service";

const PrimeForm = () => {

    const [n1, setn1] = React.useState(0);
    const [n2, setn2] = React.useState(0);
    const [result, setresult] = React.useState([]);
    const [history] = React.useState([]);

    const Calculate = (event) => {
        event.preventDefault();
        Service.add(n1, n2).then(v => setresult(v))
        history.push(n1 + " e " + n2)
    }

    return (
        <div className="primeform">
            <div>
                <h1>Primos entre dois números</h1>
                <p>Submeta dois números para mostrar uma lista de números primos entre eles.</p>
            </div>
            <div>
                <p>Digite dois números inteiros não negativos:</p>
                <form onSubmit={Calculate}>
                    <input onChange = {(e) => setn1(e.target.value)} type="number" min="0" max="99999" placeholder=" Digite o primeiro número aqui" required></input>
                    <input onChange = {(e) => setn2(e.target.value)} type="number" min="0" max="99999" placeholder=" Digite o segundo número aqui" required></input>
                    <div>
                        <button type="submit">Calcular</button>
                    </div>
                </form>
            </div>
            <div>
                <h2>Resultado:</h2>
                <p>{result.join(", ")}</p>
            </div>
            <div>
                <h2>Histórico:</h2>
                <p>{history.join(", ")}</p>
            </div>
        </div>
    );
}
 
export default PrimeForm;