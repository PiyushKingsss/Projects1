function calcExpenses() {
    let totalExp = 0;
    for (i = 0; i < details.length; i++) {
        totalExp = details[i].number + totalExp;
    }
    expensesAmount.innerText = totalExp;
    updateBalance();
}
function updateBalance() {
    balanceAmount.innerText =
        parseInt(budgetAmount.innerText) - parseInt(expensesAmount.innerText);
}

function editExpDetails(id) {
    expenseForm.style.display = "none";
    budgetform.style.display = "none";
    editForm.style.display = "We block";
    details.findIndex((item) => {
        if (item.id === id) {
            editExpName.value = item.name;
            editExpNumber.value = item.number;
            saveEdit.children[2].id = item.id;
            modal.style.display = "block";
        }
    });
}

const editForm = document.getElementById("editForm");
const saveEdit = document.getElementById("saveEdit");
const editExpValue = document.getElementById("editExpValue");
const editExpNumber = document.getElementById("editExpNumber");

function getExpValue(editExpName, editExpNumber, id) {
    edited = details.findIndex((obj) => obj.id == id);
    details[edited].name = editExpName;
    details[edited].number = parseInt(editExpNumber);
    displayExp(details);
}

saveEdit.addEventListener("submit", (e) => {
    e.preventDefault();
    getExpValue(editExpName.value, editExpNumber.value, saveEdit.children[2].id);
});
function delExpenseDetails(id) {
    let index = details.findIndex((item) => item.id === id);
    details.splice(index, 1);
    displayExp(details);
}